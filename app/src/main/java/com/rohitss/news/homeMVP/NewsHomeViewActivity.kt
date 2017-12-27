/*
 * Copyright (C) 2017 Rohit Sahebrao Surwase.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rohitss.news.homeMVP

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.rohitss.news.R

/**
 * Created by RohitSS on 27-12-2017.
 */
class NewsHomeViewActivity : AppCompatActivity(), NewsHomeView {
    val newsHomePresenter: NewsHomePresenterImpl = NewsHomePresenterImpl(this, NewsHomeInteracterImpl())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_home)
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun noNetworkError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun requestSuccess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun requestFailed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}