import java.util.Locale;

public class Shape {
    protected final double pos_x;
    protected final double pos_y;
    protected final double pos_z;

    protected final double r;
    protected final double g;
    protected final double b;

    public Shape(double pos_x, double pos_y, double pos_z, double r, double g, double b) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.pos_z = pos_z;

        this.r = r;
        this.g = g;
        this.b = b;
    }

    protected String start() {
        return String.format(Locale.US,
                "<transform translation='%f %f %f'>\n" +
                "   <shape>\n" +
                "       <appearance>\n" +
                "           <material diffuseColor='%f %f %f'></material>\n" +
                "       </appearance>\n",
            this.pos_x, this.pos_y, this.pos_z,
            this.r, this.g, this.b
        );
    }

    protected String finish() {
        return "    </shape>" +
                "</transform>";
    }

    public String build() {
        return this.start() + this.finish();
    }
}
