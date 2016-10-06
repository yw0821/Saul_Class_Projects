/**
 * Created by Yang on 2016/10/5.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DataReader {
    static public String DATE[] = new String[1000000];
    static public String MktRF[] =new String[1000000];
    static public String SMB[] = new String[1000000];
    static public String HML[] = new String[1000000];
    static public String RMW[] = new String[1000000];
    static public String CMA[] = new String[1000000];
    static public String RF[] = new String[1000000];
    static public int NumData = 0;

    public static void readData(String Path) {
        try {
            FileReader file = new FileReader(Path);
            BufferedReader in = new BufferedReader(file);
            String valueString = null;
            int i = 0;
            while ((valueString = in.readLine()) != null) {
                String item[] = line.split("，");
                String st1 = item[item.length-1];
                DATE[i] = st1;
                String st2 = item[item.length-1];
                MktRF[i]=st2;
                String st3 = item[item.length-1];
                SMB[i]=st3;
                String st4 = item[item.length-1];
                HML[i]=st4;
                String st5 = item[item.length-1];
                RMW[i]=st5;
                String st6 = item[item.length-1];
                CMA[i]=st6;
                String st7 = item[item.length-1];
                RF[i]=st7;
                i++;
            }
            NumData = i;
            in.close();
        } catch (Exception e) {
        }
    }

}