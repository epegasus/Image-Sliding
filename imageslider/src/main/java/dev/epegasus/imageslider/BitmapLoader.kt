package dev.epegasus.imageslider

import android.content.Context

import android.graphics.Bitmap


/**
 * @Author: SOHAIB AHMED
 * @Date: 02,February,2023
 * @Accounts
 *      -> https://github.com/epegasus
 *      -> https://stackoverflow.com/users/20440272/sohaib-ahmed
 */


interface BitmapLoader {
    fun loadDrawable(context: Context, resourceId: Int): Bitmap?
}