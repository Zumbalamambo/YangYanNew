package com.yangyan.xxp.yangyannew.di.module

import com.jess.arms.di.scope.ActivityScope

import dagger.Module
import dagger.Provides

import com.yangyan.xxp.yangyannew.mvp.contract.MainContract
import com.yangyan.xxp.yangyannew.mvp.model.MainModel
import com.yangyan.xxp.yangyannew.mvp.ui.fragment.CategoryFragment
import com.yangyan.xxp.yangyannew.mvp.ui.fragment.HomeFragment
import com.yangyan.xxp.yangyannew.mvp.ui.fragment.MineFragment


@Module
class MainModule
/**
 * 构建MainModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
 *
 * @param view
 */
(private val view: MainContract.View) {

    @ActivityScope
    @Provides
    internal fun provideMainView(): MainContract.View {
        return this.view
    }

    @ActivityScope
    @Provides
    internal fun provideMainModel(model: MainModel): MainContract.Model {
        return model
    }

    @ActivityScope
    @Provides
    internal fun provideHomeFragment() = HomeFragment.newInstance()

    @ActivityScope
    @Provides
    internal fun provideCategoryFragment() = CategoryFragment.newInstance()

    @ActivityScope
    @Provides
    internal fun provideMineFragment() = MineFragment.newInstance()
}

