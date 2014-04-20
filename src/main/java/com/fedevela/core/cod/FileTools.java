package com.fedevela.core.cod;

/**
 * Created by Federico on 20/04/14.
 */
import com.codicentro.core.model.CCell;
import java.io.*;
import java.math.BigDecimal;
import java.net.URL;
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.*;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @deprecated
 */
public class FileTools {

    private static Logger logger = LoggerFactory.getLogger(FileTools.class);

    /**
     *
     * @param req
     * @return
     */
    public static String getRootPath(HttpServletRequest req) {
        File p = new File("");

        return req.getSession().getServletContext().getRealPath("");
    }

    /**
     *
     * @return
     */
    public static String getRootPath() {
        String res = "";
        try {
            File p = new File(".");
            res = p.getCanonicalPath();
        } catch (IOException ex) {
            //Logs.setLogs("codicentro-tools", "Class:FileTools.java\nMethods:getRootPath()\n" + ex.getMessage());
        }

        return res;
    }

    /**
     *
     * @param directory
     * @return
     */
    public static boolean deleteAllFiles(String directory) {
        File f = new File(directory);
        if (!(f.exists())) {
            f.mkdirs();
        }

        String[] dirs = f.list();
        if ((dirs != null) && (dirs.length > 0)) {
            for (int i = 0; i < dirs.length; ++i) {
                f = new File(directory + File.separator + dirs[i]);
                f.delete();
            }
        }
        return true;
    }

    /**
     *
     * @param book
     * @param sheet
     * @param row
     * @param column
     * @param idCell
     * @param idxCell
     * @throws CDCException
     */
    private static int columnDef(XSSFWorkbook book, XSSFSheet sheet, XSSFRow row, Element column, List<CCell> cells, int idxCell) throws CDCException {
        CCell c = new CCell(column.getAttribute("name").getValue());
        /**
         * * VARS **
         */
        XSSFCellStyle style = book.createCellStyle();
        style.setBorderBottom(TypeCast.toShort(1));
        style.setBorderTop(TypeCast.toShort(1));
        style.setBorderLeft(TypeCast.toShort(1));
        style.setBorderRight(TypeCast.toShort(1));

        XSSFFont font = book.createFont();
        XSSFCell cell = null;
        /**
         * * COL INDEX INCREMENT, DEFAULT 1 **
         */
        String cindexinc = (column.getAttribute("cindexinc") == null) ? null : column.getAttribute("cindexinc").getValue();
        if (TypeCast.toBigInteger(cindexinc) != null) {
            idxCell = idxCell + TypeCast.toInt(cindexinc);
        } else {
            idxCell++;
        }
        /**
         * * COL INDEX **
         */
        String cindex = (column.getAttribute("cindex") == null) ? null : column.getAttribute("cindex").getValue();
        if (TypeCast.toBigInteger(cindex) != null) {
            idxCell = TypeCast.toInt(cindex);
        }
        logger.info("Col index: " + idxCell);
        /**
         * * ROW INDEX **
         */
        String rindex = (column.getAttribute("rindex") == null) ? null : column.getAttribute("rindex").getValue();
        if (TypeCast.toBigInteger(rindex) != null) {
            row = sheet.getRow(TypeCast.toInt(rindex));
        }
        cell = row.createCell(idxCell);
        /**
         * * ROW SPAN **
         */
        String rowspan = (column.getAttribute("rowspan") == null) ? null : column.getAttribute("rowspan").getValue();
        if (TypeCast.toBigInteger(rowspan) != null) {
            logger.info("Rows a cell should span: " + idxCell + " to " + rowspan);
            sheet.addMergedRegion(new CellRangeAddress(cell.getRowIndex(), TypeCast.toInt(rowspan), idxCell, idxCell));
        }

        /**
         * * COL SPAN **
         */
        String colspan = (column.getAttribute("colspan") == null) ? null : column.getAttribute("colspan").getValue();
        if (TypeCast.toBigInteger(colspan) != null) {
            logger.info("Columns a cell should span: " + cell.getColumnIndex() + " to " + (cell.getColumnIndex() + TypeCast.toInt(colspan) - 1));
            sheet.addMergedRegion(new CellRangeAddress(cell.getRowIndex(), cell.getRowIndex(), idxCell, cell.getColumnIndex() + TypeCast.toInt(colspan) - 1));
        }



        /**
         * * ALIGMENT **
         */
        String alignment = (column.getAttribute("alignment") == null) ? null : column.getAttribute("alignment").getValue();
        if (!TypeCast.isNullOrEmpty(alignment)) {
            if (alignment.equals("alCenter")) {
                style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
            } else if (alignment.equals("alCenterSelection")) {
                style.setAlignment(XSSFCellStyle.ALIGN_CENTER_SELECTION);
            } else if (alignment.equals("alFill")) {
                style.setAlignment(XSSFCellStyle.ALIGN_FILL);
            } else if (alignment.equals("alGeneral")) {
                style.setAlignment(XSSFCellStyle.ALIGN_GENERAL);
            } else if (alignment.equals("alJustify")) {
                style.setAlignment(XSSFCellStyle.ALIGN_JUSTIFY);
            } else if (alignment.equals("alLeft")) {
                style.setAlignment(XSSFCellStyle.ALIGN_LEFT);
            } else if (alignment.equals("alRight")) {
                style.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
            }
        }

        /**
         * * VERTICAL ALIGMENT **
         */
        String valignment = (column.getAttribute("valignment") == null) ? null : column.getAttribute("valignment").getValue();
        if (!TypeCast.isNullOrEmpty(valignment)) {
            if (valignment.equals("alBottom")) {
                style.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);
            } else if (valignment.equals("alCenter")) {
                style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
            } else if (valignment.equals("alJustify")) {
                style.setVerticalAlignment(XSSFCellStyle.VERTICAL_JUSTIFY);
            } else if (valignment.equals("alTop")) {
                style.setVerticalAlignment(XSSFCellStyle.VERTICAL_TOP);
            }
        }
        /**
         * * WRAP TEXT **
         */
        style.setWrapText((column.getAttribute("wrap") == null) ? false : TypeCast.toBoolean(column.getAttribute("wrap").getValue()));

        /**
         * * ROTATION **
         */
        String rotation = (column.getAttribute("rotation") == null) ? null : column.getAttribute("rotation").getValue();
        if (TypeCast.toBigDecimal(rotation) != null) {
            style.setRotation(TypeCast.toBigDecimal(rotation).shortValue());
        }

        /**
         * * BACKGROUND **
         */
        String background = (column.getAttribute("background") == null) ? null : column.getAttribute("background").getValue();
        if (!TypeCast.isNullOrEmpty(background)) {
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            if (TypeCast.toShortD(background) != null) {
                style.setFillForegroundColor(TypeCast.toShortD(background));
            } else {
                style.setFillForegroundColor(TypeCast.toShort(TypeCast.GF("org.apache.poi.hssf.util.HSSFColor$" + background.toUpperCase(), "index")));
            }
        }
        /**
         * * WIDTH **
         */
        BigDecimal width = (column.getAttribute("width") == null) ? null : TypeCast.toBigDecimal(column.getAttribute("width").getValue());
        if (width != null) {
            width = TypeCast.toBigDecimal(width.doubleValue() * 1308.90);
            sheet.setColumnWidth(idxCell, width.intValue());
        }

        /**
         * * HEIGHT **
         */
        BigDecimal height = (column.getAttribute("height") == null) ? null : TypeCast.toBigDecimal(column.getAttribute("height").getValue());
        if (height != null) {
            height = TypeCast.toBigDecimal(height.doubleValue() * 1308.90);
            row.setHeight(height.shortValue());
        }

        /**
         * * FONT BOLD **
         */
        Boolean bold = (column.getAttribute("bold") == null) ? TypeCast.toBoolean("false") : TypeCast.toBoolean(column.getAttribute("bold").getValue());
        if (bold) {
            font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
        }
        /**
         * * SUMMARY **
         */
        c.setSummary((column.getAttribute("summary") == null) ? TypeCast.toBoolean("false") : TypeCast.toBoolean(column.getAttribute("summary").getValue()));
        /**
         * * SUMMARY FORMULA **
         */
        c.setSummaryFormula((column.getAttribute("summaryFormula") == null) ? null : column.getAttribute("summaryFormula").getValue());
        /**
         * * FORMULA **
         */
        c.setFormula((column.getAttribute("formula") == null) ? null : column.getAttribute("formula").getValue());
        /**
         * * DATA FORMAT **
         */
        c.setDataFormat((column.getAttribute("format") == null) ? null : column.getAttribute("format").getValue());
        /**
         * * RENDER DATA **
         */
        c.setRender((column.getAttribute("render") == null) ? true : TypeCast.toBoolean(column.getAttribute("render").getValue()));

        style.setFont(font);
        cell.setCellStyle(style);
        cell.setCellValue(column.getValue());
        cells.add(c);
        return idxCell;
    }

    private static String mkFormula(String formula, int idxRow, int idxCol) {
        formula = formula.replaceAll("\\{row\\}", "" + idxRow);
        formula = formula.replaceAll("\\{col\\}", CellReference.convertNumToColString(idxCol));
        formula = formulaCheckCol(formula, idxCol);
        return formula;
    }

    private static String formulaCheckCol(String fm, int idxCol) {
        int posCol = fm.indexOf("{col");
        if (posCol == -1) {
            return fm;
        }
        int posKey = fm.indexOf("}");
        if (posKey == -1) {
            return fm;
        }
        String str = fm.substring(posCol + 4, posKey);
        if (TypeCast.isNullOrEmpty(str)) {
            return fm;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+') {
                fm = fm.substring(0, posCol + 4) + fm.substring(posCol + 5);
                count++;
            } else if (str.charAt(i) == '-') {
                fm = fm.substring(i);
                count--;
            }
        }
        return formulaCheckCol(fm.replaceAll("\\{col\\}", CellReference.convertNumToColString(idxCol + count)), idxCol);
    }

    /**
     *
     * @param doc
     * @param idHeader
     * @param values
     * @param response
     * @param filename
     * @throws Exception
     */
    @Deprecated
    private static void exportXLS(Document doc, String idHeader, List<Map<String, Object>> values, HttpServletResponse response, String filename) throws Exception {
        /**
         * * INITIALIZE TEMPLATE **
         */
        Element root = doc.getRootElement();
        /**
         * * INITIALIZED WORKBOOK **
         */
        XSSFWorkbook book = new XSSFWorkbook();
        XSSFSheet sheet = book.createSheet();
        int idxRow = 0;
        XSSFRow row = sheet.createRow(idxRow);
        Element headers = root.getChild("headers");
        Iterator<Element> iHeader = headers.getChildren("header").iterator();
        Iterator<Element> iColumn = null;
        Element header = null;
        while ((iHeader.hasNext()) && (iColumn == null)) {
            header = iHeader.next();
            if ((header.getAttribute("name") != null) && (header.getAttribute("name").getValue().equals(idHeader))) {
                iColumn = header.getChildren("column").iterator();
            }
        }
        List<CCell> cells = new ArrayList<CCell>();
        /**
         * * HEADERS **
         */
        int idxCell = -1;
        while (iColumn.hasNext()) {
            idxCell++;
            columnDef(book, sheet, row, iColumn.next(), cells, idxCell);
        }
        XSSFCell cell = null;
        Object oValue = null;
        XSSFCellStyle style = null;
        for (Map<String, Object> value : values) {
            idxRow++;
            row = sheet.createRow(idxRow);
            for (idxCell = 0; idxCell < cells.size(); idxCell++) {
                cell = row.createCell(idxCell);
                /**
                 * * STYLE **
                 */
                style = book.createCellStyle();
                if (cells.get(idxCell).getDataFormat() != null) {
                    style.setDataFormat(book.createDataFormat().getFormat(cells.get(idxCell).getDataFormat()));
                }
                cell.setCellStyle(style);
                /**
                 * * **
                 */
                if (cells.get(idxCell).getFormula() != null) {
                    cell.setCellFormula(mkFormula(cells.get(idxCell).getFormula(), (idxRow + 1), idxCell));
                } else {
                    oValue = value.get(cells.get(idxCell).getName());
                    if (oValue instanceof java.lang.Number) {
                        cell.setCellValue(TypeCast.toBigDecimal(oValue).doubleValue());
                    } else {
                        cell.setCellValue(TypeCast.toString(oValue));
                    }
                }
            }
        }
        /**
         * * SUMMARY **
         */
        idxRow++;
        row = sheet.createRow(idxRow);
        for (idxCell = 0; idxCell < cells.size(); idxCell++) {
            if (cells.get(idxCell).isSummary()) {
                cell = row.createCell(idxCell);
                /**
                 * * STYLE **
                 */
                style = book.createCellStyle();
                if (cells.get(idxCell).getDataFormat() != null) {
                    style.setDataFormat(book.createDataFormat().getFormat(cells.get(idxCell).getDataFormat()));
                }
                cell.setCellStyle(style);
                /**
                 * * **
                 */
                if (cells.get(idxCell).getSummaryFormula() != null) {
                    cell.setCellFormula(mkFormula(cells.get(idxCell).getSummaryFormula(), idxRow, idxCell));
                }
            }
        }
        exportXLS(response, book, filename);
    }

    private static <TEntity> int render(XSSFSheet sheet, List<CCell> cells, List<TEntity> values, int idxRow) throws CDCException {
        XSSFRow row = null;
        Object oValue = null;
        XSSFCell cell = null;
        int idxCell = -1;
        XSSFCellStyle style = null;
        for (Object value : values) {
            idxRow++;
            row = sheet.createRow(idxRow);
            idxCell = -1;
            for (int idx = 0; idx < cells.size(); idx++) {
                if (cells.get(idx).isRender()) {
                    idxCell++;
                    cell = row.createCell(idxCell);
                    /**
                     * * STYLE **
                     */
                    style = sheet.getWorkbook().createCellStyle();
                    if (cells.get(idx).getDataFormat() != null) {
                        style.setDataFormat(sheet.getWorkbook().createDataFormat().getFormat(cells.get(idx).getDataFormat()));
                    }
                    cell.setCellStyle(style);
                    /**
                     * * **
                     */
                    if (cells.get(idx).getFormula() != null) {
                        cell.setCellFormula(mkFormula(cells.get(idx).getFormula(), (idxRow + 1), idxCell));
                    } else {
                        oValue = (cells.get(idx).isRender()) ? TypeCast.GN(value, "get" + cells.get(idx).getName()) : null;
                        if (oValue instanceof java.lang.Number) {
                            cell.setCellValue(TypeCast.toBigDecimal(oValue).doubleValue());
                        } else {
                            cell.setCellValue(TypeCast.toString(oValue));
                        }
                    }
                }
            }
        }
        return idxRow;
    }

    private static <TEntity> int summary(XSSFSheet sheet, List<CCell> cells, int idxRow) {
        /**
         * * SUMMARY **
         */
        idxRow++;
        XSSFRow row = sheet.createRow(idxRow);
        XSSFCell cell = null;
        XSSFCellStyle style = null;
        for (int idx = 0; idx < cells.size(); idx++) {
            if (cells.get(idx).isSummary()) {
                cell = row.createCell(idx);
                /**
                 * * STYLE **
                 */
                style = sheet.getWorkbook().createCellStyle();
                if (cells.get(idx).getDataFormat() != null) {
                    style.setDataFormat(sheet.getWorkbook().createDataFormat().getFormat(cells.get(idx).getDataFormat()));
                }
                cell.setCellStyle(style);
                /**
                 * * **
                 */
                if (cells.get(idx).getSummaryFormula() != null) {
                    cell.setCellFormula(mkFormula(cells.get(idx).getSummaryFormula(), idxRow, idx));
                }
            }
        }
        return idxRow;
    }

    /**
     *
     * @param <TEntity>
     * @param values
     * @param doc
     * @param idHeader
     * @return
     * @throws Exception
     */
    private static <TEntity> XSSFWorkbook exportXLS(XSSFWorkbook workbook, XSSFSheet sheet, List<TEntity> values, Document doc, String idHeader) throws Exception {
        /**
         * * INITIALIZE TEMPLATE **
         */
        Element root = doc.getRootElement();
        /**
         * * INITIALIZED WORKBOOK **
         */
        XSSFWorkbook book = (workbook == null) ? new XSSFWorkbook() : workbook;
        int idxRow = 0;
        XSSFRow row = null;
        Element headers = root.getChild("headers");
        Iterator<Element> iHeader = headers.getChildren("header").iterator();
        Iterator<Element> iColumn = null;
        Element header = null;
        while ((iHeader.hasNext()) && (iColumn == null)) {
            header = iHeader.next();
            if ((header.getAttribute("name") != null) && (header.getAttribute("name").getValue().equals(idHeader))) {
                /**
                 * * SHEET NAME **
                 */
                String sheetname = (header.getAttribute("sheetname") == null) ? null : header.getAttribute("sheetname").getValue();
                sheet = (TypeCast.isNullOrEmpty(sheetname)) ? book.createSheet() : book.createSheet(sheetname);
                row = sheet.createRow(idxRow);
                /**
                 * * ROW SIZE **
                 */
                String frdata = (header.getAttribute("frdata") == null) ? null : header.getAttribute("frdata").getValue();

                if (!TypeCast.isNullOrEmpty(frdata)) {
                    logger.info("First row data: " + frdata);
                    while (idxRow + 1 < TypeCast.toInt(frdata)) {
                        idxRow++;
                        sheet.createRow(idxRow);
                    }
                }
                iColumn = header.getChildren("column").iterator();
            }
        }
        List<CCell> cells = new ArrayList<CCell>();
        /**
         * * HEADERS **
         */
        int idxCell = -1;
        while (iColumn.hasNext()) {
            idxCell = columnDef(book, sheet, row, iColumn.next(), cells, idxCell);
        }

        idxRow = render(sheet, cells, values, idxRow);
        idxRow = summary(sheet, cells, idxRow);
        return book;
    }

    /**
     *
     * @param template
     * @param idHeader
     * @param values
     * @param response
     * @param filename
     * @throws Exception
     */
    @Deprecated
    public static void exportXLS(File template, String idHeader, List<Map<String, Object>> values, HttpServletResponse response, String filename) throws Exception {
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(template);
        exportXLS(doc, idHeader, values, response, filename);
    }

    /**
     *
     * @param template
     * @param idHeader
     * @param values
     * @param response
     * @param filename
     * @throws Exception
     */
    @Deprecated
    public static void exportXLS(URL template, String idHeader, List<Map<String, Object>> values, HttpServletResponse response, String filename) throws Exception {
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(template);
        exportXLS(doc, idHeader, values, response, filename);
    }

    /**
     *
     * @param key
     * @param idHeader
     * @param values
     * @param response
     * @param filename
     * @throws Exception
     */
    @Deprecated
    public static void exportXLS(String key, String idHeader, List<Map<String, Object>> values, HttpServletResponse response, String filename) throws Exception {
        SAXBuilder builder = new SAXBuilder();
        Document doc = builder.build(is(key));
        exportXLS(doc, idHeader, values, response, filename);
    }

    /**
     *
     * @param <TEntity>
     * @param values
     * @param template
     * @param idHeader
     * @param response
     * @param filename
     * @throws Exception
     */
    public static <TEntity> void exportXLS(List<TEntity> values, File template, String idHeader, HttpServletResponse response, String filename) throws Exception {
        exportXLS(response, exportXLS(null, null, values, new SAXBuilder().build(template), idHeader), filename);
    }

    /**
     *
     * @param <TEntity>
     * @param values
     * @param template
     * @param idHeader
     * @param response
     * @param filename
     * @throws Exception
     */
    public static <TEntity> void exportXLS(List<TEntity> values, URL template, String idHeader, HttpServletResponse response, String filename) throws Exception {
        exportXLS(response, exportXLS(null, null, values, new SAXBuilder().build(template), idHeader), filename);
    }

    /**
     *
     * @param <TEntity>
     * @param values
     * @param template
     * @param idHeader
     * @return
     * @throws Exception
     */
    public static <TEntity> XSSFWorkbook exportXLS(List<TEntity> values, URL template, String idHeader) throws Exception {
        return exportXLS(null, null, values, new SAXBuilder().build(template), idHeader);
    }

    public static <TEntity> XSSFWorkbook exportXLS(XSSFWorkbook workbook, List<TEntity> values, URL template, String idHeader) throws Exception {
        return exportXLS(workbook, null, values, new SAXBuilder().build(template), idHeader);
    }

    public static <TEntity> XSSFWorkbook exportXLS(XSSFWorkbook workbook, XSSFSheet sheet, List<TEntity> values, URL template, String idHeader) throws Exception {
        return exportXLS(workbook, sheet, values, new SAXBuilder().build(template), idHeader);
    }

    /**
     *
     * @param <TEntity>
     * @param values
     * @param key
     * @param idHeader
     * @param response
     * @param filename
     * @throws Exception
     */
    public static <TEntity> void exportXLS(List<TEntity> values, String key, String idHeader, HttpServletResponse response, String filename) throws Exception {
        exportXLS(response, exportXLS(null, null, values, new SAXBuilder().build(is(key)), idHeader), filename);
    }

    /**
     *
     * @param key
     * @param rsc
     * @return
     * @throws Exception
     */
    public static InputStream is(String key, String rsc) throws Exception {
        ResourceBundle rb = ResourceBundle.getBundle("commons-property");
        return (new URL(rb.getString(key) + rsc)).openStream();
    }

    /**
     *
     * @param key
     * @return
     * @throws Exception
     */
    public static InputStream is(String key) throws Exception {
        ResourceBundle rb = ResourceBundle.getBundle("commons-property");
        return (new URL(rb.getString(key))).openStream();
    }

    /**
     *
     * @param response
     * @param book
     * @param filename
     * @throws java.lang.Exception
     */
    public static void exportXLS(HttpServletResponse response, XSSFWorkbook book, String filename) throws Exception {
        response.setHeader("Expires", "0");
        response.setHeader("Cache-Control", "must-revalidate, post-check=0, pre-check=0");
        response.setHeader("Content-disposition", "attachment;filename=\"" + filename + ".xls\"");
        response.setHeader("Pragma", "public");
        response.setContentType("application/vnd.ms-excel");
        OutputStream out = response.getOutputStream();
        book.write(out);
        out.close();
    }

    public static void doDownload(
            HttpServletRequest request,
            HttpServletResponse response,
            String filename,
            String originalFilename) throws IOException {
        File f = new File(filename);
        int length = 0;
        ServletOutputStream op = response.getOutputStream();
        ServletContext context = request.getSession().getServletContext();
        String mimetype = context.getMimeType(filename);
        //
        //  Set the response and go!
        //
        //
        response.setContentType((mimetype != null) ? mimetype : "application/octet-stream");
        response.setContentLength((int) f.length());
        response.setHeader("Content-Disposition", "attachment; filename=\"" + originalFilename + "\"");
        //
        //  Stream to the requester.
        //
        byte[] bbuf = new byte[1024];
        DataInputStream in = new DataInputStream(new FileInputStream(f));
        while ((in != null) && ((length = in.read(bbuf)) != -1)) {
            op.write(bbuf, 0, length);
        }
        in.close();
        op.flush();
        op.close();
    }
}