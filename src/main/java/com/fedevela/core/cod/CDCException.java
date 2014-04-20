package com.fedevela.core.cod;

/**
 * Created by Federico on 20/04/14.
 */
import java.io.Serializable;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CDCException extends Exception implements Serializable {

    private Logger log = LoggerFactory.getLogger(CDCException.class);
    private String frontEndMessage;
    private String backEndMessage;
    private int errorCode;

    /**
     *
     * @param message
     */
    public CDCException(String message) {
        super(message);
        frontEndMessage = message;
        backEndMessage = message;
        errorCode = -1;
    }

    /**
     *
     * @param frontEndMessage
     * @param backEndMessage
     */
    public CDCException(String frontEndMessage, String backEndMessage) {
        super(frontEndMessage);
        this.frontEndMessage = frontEndMessage;
        this.backEndMessage = frontEndMessage + "\n" + backEndMessage;
        errorCode = -1;
    }

    /**
     *
     * @param e
     */
    public CDCException(Exception e) {
        super(e);
        frontEndMessage = e.getMessage();
        backEndMessage = (e.getCause() != null) ? e.getCause().toString() : null;
        if (e instanceof SQLException) {
            errorCode = ((SQLException) e).getErrorCode();
        } else {
            errorCode = -1;
        }
    }

    public CDCException(String frontEndMessage, Exception e) {
        super(e);
        this.frontEndMessage = frontEndMessage;
        backEndMessage = (e.getCause() != null) ? e.getCause().toString() : null;
        if (e instanceof SQLException) {
            errorCode = ((SQLException) e).getErrorCode();
        } else {
            errorCode = -1;
        }
    }

    /**
     *
     * @return
     */
    public String getFrontEndMessage() {
        return frontEndMessage;
    }

    /**
     *
     * @return
     */
    public int getErrorCode() {
        return errorCode;
    }
}
