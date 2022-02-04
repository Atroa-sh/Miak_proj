import java.util.Locale;

public class Box extends Shape{
    protected final double size_x;
    protected final double size_y;
    protected final double size_z;

    public Box(double pos_x, double pos_y, double pos_z, double size_x, double size_y, double size_z, double r, double g, double b) {
        super(pos_x, pos_y, pos_z, r, g, b);

        this.size_x = size_x;
        this.size_y = size_y;
        this.size_z = size_z;
    }

    @Override
    protected String start() {
        return super.start() + String.format(Locale.US,
                "<box size='%f %f %f'>\n",
                this.size_x, this.size_y, this.size_z
        );
    }

    @Override
    protected String finish() {
        return "</box>\n" + super.finish();
    }

    @Override
    public String build() {
        return this.start() + this.finish();
    }
}
