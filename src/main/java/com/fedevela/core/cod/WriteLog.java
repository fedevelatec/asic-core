package com.fedevela.core.cod;

/**
 * Created by Federico on 20/04/14.
 */
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @deprecated
 */
public class WriteLog
{
    private String filePath = null;
    private String fileName = null;
    private FileWriter fw = null;

    public WriteLog(String filePath, String processType)
    {
        this.filePath = (filePath + TypeCast.toString(new Date(), "yyyyMMdd") + File.separator);
        this.fileName = (this.filePath + processType + TypeCast.toString(new Date(), "-HHmmss"));
    }

    public WriteLog(String filePath, String processType, String fileName)
    {
        this.filePath = filePath;
        this.fileName = (filePath + processType + fileName);
    }

    private void saveLog(String message, String fileType)
    {
        try
        {
            checkTreeDir(this.filePath);
            this.fw = new FileWriter(getFileName() + (fileType == null ? ".log" : fileType), true);
            this.fw.write(TypeCast.toString(new Date(), "dd/MM/yyyy HH:mm:ss") + ": " + message + "\n");
            this.fw.close();
        }
        catch (Exception ex)
        {
            Logger.getLogger(WriteLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveText(String text, String fileType)
    {
        try
        {
            checkTreeDir(this.filePath);
            this.fw = new FileWriter(getFileName() + (fileType == null ? ".txt" : fileType), true);
            this.fw.write(text + "\n");
            this.fw.close();
        }
        catch (Exception ex)
        {
            Logger.getLogger(WriteLog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void log(String message)
    {
        saveLog(message, null);
    }

    public void log(String message, String fileType)
    {
        saveLog(message, fileType);
    }

    public void text(String text)
    {
        saveText(text, null);
    }

    public void text(String text, String fileType)
    {
        saveText(text, fileType);
    }

    public static void checkTreeDir(String path)
    {
        try
        {
            File file = new File(path);
            file.setReadable(true, false);
            file.setWritable(true, false);
            file.setExecutable(true, false);
            if (!file.isDirectory()) {
                file.mkdirs();
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public String getFileName()
    {
        return this.fileName;
    }
}
