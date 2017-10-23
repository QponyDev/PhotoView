package com.github.chrisbanes.photoview;

import android.widget.ImageView;

/**
 * A callback to be invoked when the Photo is tapped with a single
 * tap.
 */
public interface OnPhotoLongPressListener {

    /**
     * A callback to receive where the user long presses on a photo. You will only receive a callback if
     * the user taps on the actual photo, tapping on 'whitespace' will be ignored.
     *
     * @param view ImageView the user long pressed.
     * @param x    where the user long pressed from the of the Drawable, as percentage of the
     *             Drawable width.
     * @param y    where the user long pressed from the top of the Drawable, as percentage of the
     *             Drawable height.
     */
    void onPhotoLongPress(ImageView view, float x, float y);
}
