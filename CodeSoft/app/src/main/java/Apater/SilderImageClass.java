package Apater;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.codesoft.R;

public class SilderImageClass extends PagerAdapter {

    Context context;
    private int[] images;
    private String[] text;
    public SilderImageClass (Context context, int[] images, String[] text){
        this.context=context;
        this.images=images;
        this.text=text;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.silder_image, container, false);

        ImageView imageView = view.findViewById(R.id.Image_view_part_01);
        TextView textView = view.findViewById(R.id.Relative_layout_page_View);

        imageView.setImageResource(images[position]);
        textView.setText(text[position]);

        container.addView(view);
        Log.e("TAG", "instantiateItem: Instantiate" );
        return view;
    }
}
