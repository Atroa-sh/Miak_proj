import java.util.ArrayList;
import java.util.List;

public class Scene {
    protected final int WIDTH;
    protected final int HEIGHT;

    private final List<Shape> shapes = new ArrayList<>();

    public Scene(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
    }

    private String start() {
        return String.format(
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "   <meta charset=\"UTF-8\">\n" +
                "   <script type='text/javascript' src='http://www.x3dom.org/download/x3dom.js'> </script>\n" +
                "   <link rel='stylesheet' type='text/css' href='http://www.x3dom.org/download/x3dom.css'></link>\n" +
                "   <title>Result</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "   <x3d width='%dpx' height='%dpx'>\n" +
                "       <scene>\n"
        , this.WIDTH, this.HEIGHT);
    }

    private String finish() {
        return  "       </scene>\n" +
                "   </x3d>\n" +
                "</body>\n" +
                "</html>\n";
    }

    public String buildShapes() {
        StringBuilder res = new StringBuilder();

        for(Shape shape : this.shapes)
            res.append(shape.build());

        return res.toString();
    }

    public String build() {
        return this.start() + this.buildShapes() + this.finish();
    }

    public void addShape(Shape shape){
        this.shapes.add(shape);
    }
}
