package com.fedevela.core.cod.extjs;

/**
 * Created by Federico on 20/04/14.
 */
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import com.fedevela.core.cod.TypeCast;
import com.fedevela.core.cod.annotation.CWColumn;
import org.apache.commons.lang.WordUtils;

public class Utils
{
    public static Map<String, StringBuilder> toGridColumn(Class c, Map<String, StringBuilder> write, String mapping)
    {
        boolean close = false;
        if ((write == null) || (write.isEmpty()))
        {
            write = new HashMap();
            write.put("column", new StringBuilder());
            write.put("field", new StringBuilder());
            write.put("model", new StringBuilder("this.cm = new Ext.grid.ColumnModel([\n"));
            write.put("filter", new StringBuilder("this.flt = new Ext.ux.grid.GridFilters({\nfilters:[\n"));
            close = true;
        }
        for (Field field : c.getDeclaredFields()) {
            if (field.getAnnotation(CWColumn.class) != null)
            {
                CWColumn cwc = (CWColumn)field.getAnnotation(CWColumn.class);
                Long width = TypeCast.toLong(Double.valueOf(cwc.width() * 100.0D));
                String header;
                if (!TypeCast.isBlank(cwc.header()))
                {
                    header = cwc.header();
                }
                else
                {
                    Column clmn = (Column)field.getAnnotation(Column.class);
                    header = clmn != null ? clmn.name() : field.getName();
                    header = WordUtils.capitalizeFully(header).replace("_", " ");
                }
                ((StringBuilder)write.get("column")).append("this.cm").append(TypeCast.toFirtUpperCase(field.getName())).append("={\n");
                ((StringBuilder)write.get("column")).append("header:'").append(header).append("',\n");
                ((StringBuilder)write.get("column")).append("headerAlign:'").append(cwc.headerAlign()).append("',\n");
                ((StringBuilder)write.get("column")).append("align:'").append(cwc.align()).append("',\n");
                ((StringBuilder)write.get("column")).append("dataIndex:'").append(field.getName()).append("',\n");
                ((StringBuilder)write.get("column")).append("sortable: true,\n");
                if (!TypeCast.isBlank(cwc.summaryType())) {
                    ((StringBuilder)write.get("column")).append("summaryType:'").append(cwc.summaryType()).append("',\n");
                }
                if (!TypeCast.isBlank(cwc.summaryRenderer())) {
                    ((StringBuilder)write.get("column")).append("summaryRenderer:function(){ return '").append(cwc.summaryRenderer()).append("'; },\n");
                }
                if (!TypeCast.isBlank(cwc.renderer())) {
                    ((StringBuilder)write.get("column")).append("renderer:").append(cwc.renderer()).append(",\n");
                }
                ((StringBuilder)write.get("column")).append("width:").append(width).append("\n");
                ((StringBuilder)write.get("column")).append("};\n\n");
                if (!TypeCast.isBlank(mapping)) {
                    ((StringBuilder)write.get("field")).append("{name:'").append(field.getName()).append("',mapping:'").append(mapping).append('.').append(field.getName()).append("'},\n");
                } else {
                    ((StringBuilder)write.get("field")).append("'").append(field.getName()).append("',\n");
                }
                ((StringBuilder)write.get("model")).append("this.cm").append(TypeCast.toFirtUpperCase(field.getName())).append(",\n");
                if (cwc.filter()) {
                    ((StringBuilder)write.get("filter")).append("{type: 'string',dataIndex: '").append(field.getName()).append("',param:'").append(field.getName()).append("'},\n");
                }
            }
            else if (field.getAnnotation(EmbeddedId.class) != null)
            {
                toGridColumn(field.getType(), write, field.getName());
            }
        }
        if (close)
        {
            ((StringBuilder)write.get("model")).append("]);");
            ((StringBuilder)write.get("filter")).append("]});");
        }
        return write;
    }
}
