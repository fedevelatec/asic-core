package com.fedevela.core.cod;

/**
 * Created by Federico on 20/04/14.
 */
public class Types
{
    public static enum SQLType
    {
        SET,  LIST,  ARRAY,  VARCHAR,  INTEGER,  CURSOR,  DATE,  DATETIME,  NUMERIC,  BOOLEAN,  OTHER,  BIGINT,  DECIMAL,  DOUBLE,  FLOAT,  INT,  LVARCHAR;

        private SQLType() {}
    }

    public static enum RenderType
    {
        EXTJS_TREE,  EXTJS_MENU;

        private RenderType() {}
    }

    public static enum XLSDataType
    {
        TEXT,  NUMERIC,  INTEGER,  DATE,  TEXT_CLS,  NUMERIC_TEXT,  INTEGER_TEXT,  TEXT_CAST,  NUMERIC_CAST,  INTEGER_CAST,  TEXT_CLS_CAST;

        private XLSDataType() {}
    }

    public static enum SQLParamType
    {
        IN,  OUT,  INOUT;

        private SQLParamType() {}
    }

    public static enum TableType
    {
        EXECUTE,  EXECUTE_ROWS_AFFECTED,  NORMAL,  JSON,  ARRAY,  IFX_MULTISET;

        private TableType() {}
    }

    public static enum WrapperType
    {
        NORMAL,  JSON,  ARRAY;

        private WrapperType() {}
    }

    public static enum AlignmentType
    {
        LEFT,  CENTER,  RIGHT;

        private AlignmentType() {}
    }

    public static enum EncrypType
    {
        SHA1,  MD5,  NONE;

        private EncrypType() {}
    }

    public static enum LoggerOutType
    {
        ALL,  CONSOLE,  FILE;

        private LoggerOutType() {}
    }

    public static enum DBProtocolType
    {
        POSTGRESQL,  MYSQL,  ORACLE,  SQLSERVER,  DB2,  INFORMIX;

        private DBProtocolType() {}
    }

    public static enum SummaryType
    {
        NONE,  SUM,  COUNT;

        private SummaryType() {}
    }
}
