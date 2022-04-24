package com.example.guessthebox.fragments.contract

import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import com.example.guessthebox.model.Options

typealias ResultListener<T> = (T) -> Unit

fun Fragment.navigator() : Navigator {
    return requireActivity() as Navigator
}

interface Navigator {
    fun showBoxSelectionScreen(options: Options)

    fun showOptionsScreen(options: Options)

    fun showAboutScreen(options: Options)

    fun showBoxCongratulationsScreen(options: Options)

    fun goBack(options: Options)

    fun goToMenu(options: Options)

    fun <T : Parcelable> publishResult(result: T)

    fun <T : Parcelable> listenResult(clazz: Class<T>, owner: LifecycleOwner, litener: ResultListener<T>)
}
