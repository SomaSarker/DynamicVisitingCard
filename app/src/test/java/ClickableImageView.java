public class ClickableImageView import android.content.Context;
        import android.graphics.Color;
        import android.graphics.PorterDuff;
        import android.util.AttributeSet;
        import androidx.appcompat.widget.AppCompatImageView;

public class ClickableImageView extends AppCompatImageView {

    public ClickableImageView(Context context) {
        super(context);
    }

    public ClickableImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ClickableImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean performClick() {
        super.performClick();
        return true;
    }

    @Override
    public boolean performLongClick() {
        super.performLongClick();
        return true;
    }
}
{
}
