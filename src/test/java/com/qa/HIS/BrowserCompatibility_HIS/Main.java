package com.qa.HIS.BrowserCompatibility_HIS;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Encoded string
        String encodedString = "N0XUM2Nn2vwmIcZvbhoKOX9j8%2Bdvyu8JOTXe%2BPWrJQcEv%2B5qVk3XsGljcv5PJdP75PpsttWJDuZF85wsDWJbWF5S2r%2F%2FF9dfUIBBXz6p3p0tz6vf3%2F355duP74yb9rrMxzNyS8vsOv0s%2FXhZLfOPDbKCyO%2Fym%2F26v%2BhnBYPfJ282oMC0MNPKBPl1X6Ppr%2FsbadtHaMjxlJmz38j9%2BrvwVP%2BGL8nGPsmmb7%2Bqy193%2F5fS0sgF7D4bq%2BCPIJJ88dXvU7YPL64X128%2FI1C%2FK1jkF%2FwGJ01zgjj11%2F0xisJeVGR5y1%2Fw6%2Fz%2Bv%2BvrJ78WTe%2Bvda83f0S279%2BSbN%2FQLP1%2BH97d5im535FC%2FffHHE9LXPjrnr3c3j%2BYgavlg99ufY88tf379yfV%2FnTv4v79%2B9n9Km%2Fv35%2FN%2Fh%2FZSu9PYGMAAA%3D%";

        try {
            // Decode the base64-encoded string
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString);

            // Decompress using gzip
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ByteArrayInputStream bais = new ByteArrayInputStream(decodedBytes);
            GZIPInputStream gis = new GZIPInputStream(bais);

            byte[] buffer = new byte[1024];
            int len;
            while ((len = gis.read(buffer)) > 0) {
                baos.write(buffer, 0, len);
            }

            // Get the decompressed string
            String decompressedString = new String(baos.toByteArray(), "UTF-8");

            // Print the decompressed string
            System.out.println(decompressedString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
