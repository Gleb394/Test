package downloadPicture;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;

/**
 * Created by Gleb on 21.07.17.
 */
public class Picture {
    public static void main(String[] args) throws IOException {

/*        URL urlHtml = new URL("http://flangex.herokuapp.com/io/load");
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(urlHtml.openStream()));
       BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("src/main/java/downloadPicture/index.html")
                )
        );

        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            writer.append(inputLine + "\n");
        }

        reader.close();
        writer.close();*/

        final Path downloadDirectory = Paths.get("C:\\Users\\Evgeniy\\Desktop\\");
        if (Files.notExists(downloadDirectory)) {
            Files.createDirectory(downloadDirectory);
        }

        final String hostName = "http://flangex.herokuapp.com";
        Document main_doc = Jsoup.connect(hostName + "/io/load").get();
        Elements links = main_doc.select("a[href]"); // a with href
        for (Element link : links) {
            final String urlImagePath = hostName + link.attr("href");
            final URL pageImageUrl = new URL(urlImagePath);
            final String imageFileName = urlImagePath.substring(urlImagePath.lastIndexOf('/') + 1, urlImagePath.length());
            final BufferedImage image = ImageIO.read(pageImageUrl);
            final Path downloadFileName = downloadDirectory.resolve(imageFileName);
            ImageIO.write(image, "png", downloadFileName.toFile());
        }

        /*FileWriter writer1 = new FileWriter("src/main/java/downloadPicture/.png");*//*
        System.out.println(linkhref.toString());



        /*public static void main(String[] args) throws IOException {
            String htmlString = "<html><head><title>Simple Page</title></head>"
                    + "<body>Hello</body></html>";
            Document doc = Jsoup.parse(htmlString);
            String title = doc.title();
            System.out.println("Title : " + title);
            System.out.println("Content:\n");
            System.out.println(doc.toString());
        }*/
    }

}