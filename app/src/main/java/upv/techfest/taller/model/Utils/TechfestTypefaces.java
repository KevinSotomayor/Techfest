package upv.techfest.taller.model.Utils;

import android.content.res.AssetManager;
import android.graphics.Typeface;

/**
 * Created by Kevin on 11/10/15.
 */
public class TechfestTypefaces {
    public static String robotoRegular = "Roboto-Regular.ttf"; // 1
    public static String robotoLight = "Roboto-Light.ttf"; //2
    public static String robotoThin = "Roboto-Thin.ttf"; //3

    //New Roboto Slab - serif
    public static String robotoSlabRegular = "RobotoSlab-Regular.ttf"; //4
    public static String robotoSlabThin = "RobotoSlab-ThinItalic.ttf"; //5



    public static Typeface robotoRegularTypeface ;
    public static Typeface robotoLightTypeface;
    public static Typeface robotoThinTypeface;
    public static Typeface robotoSlabRegularTypeface;
    public static Typeface robotoSlabThinItalicTypeface;

    public static Typeface getFont(AssetManager asset, int number) {
        switch (number) {
            case 1:
                if(robotoRegularTypeface==null){
                    robotoRegularTypeface=Typeface.createFromAsset(asset, robotoRegular);
                }
                return robotoRegularTypeface;
            case 2:
                if(robotoLightTypeface==null){
                    robotoLightTypeface=Typeface.createFromAsset(asset, robotoLight);
                }
                return robotoLightTypeface;
            case 3:
                if(robotoThinTypeface==null){
                    robotoThinTypeface=Typeface.createFromAsset(asset, robotoThin);
                }
                return robotoThinTypeface;
            case 4:
                if(robotoSlabRegularTypeface==null){
                    robotoSlabRegularTypeface=Typeface.createFromAsset(asset, robotoSlabRegular);
                }
                return robotoSlabRegularTypeface;
            case 5:
                if(robotoSlabThinItalicTypeface==null){
                    robotoSlabThinItalicTypeface=Typeface.createFromAsset(asset, robotoSlabThin);
                }
                return robotoSlabThinItalicTypeface;


            default:
                if(robotoRegularTypeface==null){
                    robotoRegularTypeface=Typeface.createFromAsset(asset, robotoRegular);
                }
                return robotoRegularTypeface;

        }
    }
}
