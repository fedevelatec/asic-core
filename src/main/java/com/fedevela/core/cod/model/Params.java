package com.fedevela.core.cod.model;

/**
 * Created by Federico on 20/04/14.
 */
import com.fedevela.core.cod.Types.WrapperType;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author avillalobos
 */
public class Params implements Serializable {

    private List IN = null;
    private List OUT = null;
    private List columns = null;
    private WrapperType wrapperType = WrapperType.NORMAL;
    private boolean isDefineColumn = false;

}