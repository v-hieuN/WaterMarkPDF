package com.example.demo;

import com.groupdocs.watermark.Watermarker;
import com.groupdocs.watermark.common.HorizontalAlignment;
import com.groupdocs.watermark.common.VerticalAlignment;
import com.groupdocs.watermark.options.PdfLoadOptions;
import com.groupdocs.watermark.watermarks.Color;
import com.groupdocs.watermark.watermarks.Font;
import com.groupdocs.watermark.watermarks.TextWatermark;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class tesst {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        PdfLoadOptions loadOptions = new PdfLoadOptions();
        Watermarker watermarker = new Watermarker("D:\\NMS\\Document\\file-sample_150kB.pdf", loadOptions);

// Add text in center of all the pages
        TextWatermark textWatermark = new TextWatermark("Watermark", new Font("Arial", 80));
        textWatermark.setRotateAngle(-45);
        textWatermark.setOpacity(0.3);
        textWatermark.setForegroundColor(Color.getDarkBlue());
        textWatermark.setHorizontalAlignment(HorizontalAlignment.Center);
        textWatermark.setVerticalAlignment(VerticalAlignment.Center);

// PdfArtifactWatermarkOptions imageWatermarkOptions = new PdfArtifactWatermarkOptions();
// imageWatermarkOptions.setPageIndex(0);
        watermarker.add(textWatermark);

// Save the watermarked PDF
        watermarker.save("D:\\NMS\\Document\\text-watermark.pdf");
        watermarker.close();
    }

}
