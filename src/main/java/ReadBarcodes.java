import com.accusoft.barcodexpress.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import com.google.gson.*;

public class ReadBarcodes {
    public static void main(String[] args) throws BarcodeException, java.io.IOException {
        // Search for specific types of barcodes in an image file (by default all 1D barcodes).
        // For the full list of options, see the API reference
        // at https://help.accusoft.com/BarcodeXpress/latest/BxJava/webframe.html#API%20Reference.html
        BarcodeXpress barcodeXpress = new BarcodeXpress();
        BarcodeReader reader = barcodeXpress.getReader();
        
        BufferedImage bufferedImage = ImageIO.read(new File("test-barcodes.bmp"));
        
        reader.setBarcodeTypes(new BarcodeType[] {
            BarcodeType.CODE39,
            BarcodeType.INTELLIGENTMAIL,
            BarcodeType.CODE128,
            BarcodeType.DATAMATRIX,
            BarcodeType.QRCODE
        });

        Result[] results = reader.analyze(bufferedImage);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println("Results:");
        System.out.println(gson.toJson(results));
    }
}
