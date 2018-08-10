package com.heybox.test_new.utils;

/*
 *   Description:
 *   Package:com.heybox.test_new.utils
 *   Author:yourzeromax
 *   Date:2018/8/10 上午10:49
 */

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

public class ViewUtils {

    public static int getDesnity(Context context) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return (int) metrics.density;
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return metrics.widthPixels;
    }

    public static int getScreenHeight(Context context) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return metrics.heightPixels;
    }

    public static int getBitmapWidth(Bitmap bitmap) {
        return bitmap.getWidth();
    }

    public static int getBitmapHeight(Bitmap bitmap) {
        return bitmap.getHeight();
    }

    public static int getNavigationBarHeight(Context context) {
        int result = 0;

        Resources res = context.getResources();
        int resourceId = res.getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = res.getDimensionPixelSize(resourceId);
        }

        return result;
    }

    public static  int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        int resourceId = resources.getIdentifier("status_bar_height", "dimen", "android");
        int height = resources.getDimensionPixelSize(resourceId);
        return height;
    }

    public static Bitmap activityShot(Activity activity) {
        /*获取windows中最顶层的view*/
        View view = activity.getWindow().getDecorView();

        //允许当前窗口保存缓存信息
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();

        //获取状态栏高度
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int statusBarHeight = rect.top;

        WindowManager windowManager = activity.getWindowManager();

        //获取屏幕宽和高
        DisplayMetrics outMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(outMetrics);
//        int width = outMetrics.widthPixels;
//        int height = outMetrics.heightPixels;
        int width = view.getDrawingCache().getWidth();
        int height = view.getDrawingCache().getHeight();

//        //去掉状态栏
//        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache(), 0, statusBarHeight, width,
//                height - statusBarHeight);

        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache(), 0, 0, width,
                height);

        //销毁缓存信息
        view.destroyDrawingCache();
        view.setDrawingCacheEnabled(false);

        return bitmap;
    }

    public static int getViewHeight(Activity activity){
        return activity.getWindow().getDecorView().getHeight();
    }

    public static int getViewWidth(Activity activity){
        return activity.getWindow().getDecorView().getWidth();
    }

}
