// 
// Decompiled by Procyon v0.5.36
// 

package DEOBFUSCATED-NAMES;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.HttpURLConnection;
import java.net.URL;

public class nh
{
    public static String k;
    public static final String c1;
    public static final String c2;
    public static final String c3;
    public static final String c5;
    public static final String c6;
    public static final String c7;
    
    public static boolean vk(final String ak) {
        final String c = nc(nh.c1 + nh.c2 + nh.c3 + ak);
        return !c.isEmpty() && !c.contains(str.c12);
    }
    
    public static String nc(final String c) {
        String r = "";
        HttpURLConnection con = null;
        try {
            final URL url = new URL(c);
            con = (HttpURLConnection)url.openConnection();
            r = gc(con);
        }
        catch (MalformedURLException ex) {}
        catch (IOException ex2) {}
        finally {
            if (con != null) {
                con.disconnect();
            }
        }
        return r;
    }
    
    private static String gc(final HttpURLConnection c) {
        if (c != null) {
            try (final BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()))) {
                final StringBuilder sb = new StringBuilder();
                String input;
                while ((input = br.readLine()) != null) {
                    sb.append(input);
                }
                final String res = sb.toString();
                if (c != null) {
                    c.disconnect();
                }
                return res;
            }
            catch (Exception ex) {}
        }
        return "";
    }
    
    static {
        nh.k = "";
        c1 = new String(new char[] { 'h', 't', 't', 'p', 's', ':', '/', '/', 'a', 'p', 'i', '.', 'h', 'y', 'p', 'i', 'x', 'e', 'l', '.', 'n', 'e', 't', '/' });
        c2 = new String(new char[] { 'k', 'e', 'y' });
        c3 = new String(new char[] { '?', 'k', 'e', 'y', '=' });
        c5 = new String(new char[] { '&', 'u', 'u', 'i', 'd', '=' });
        c6 = new String(new char[] { 'h', 't', 't', 'p', 's', ':', '/', '/', 'a', 'p', 'i', '.', 'm', 'o', 'j', 'a', 'n', 'g', '.', 'c', 'o', 'm', '/', 'u', 's', 'e', 'r', 's', '/', 'p', 'r', 'o', 'f', 'i', 'l', 'e', 's', '/', 'm', 'i', 'n', 'e', 'c', 'r', 'a', 'f', 't', '/' });
        c7 = new String(new char[] { 'd', '\"', ':', '\"' });
    }
}
