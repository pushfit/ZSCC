package com.zspt.app.modulecouresdetails.course_watch.view.activity;

import com.zspt.app.library_common.base.model.HttpResult;
import com.zspt.app.library_common.base.mvp.IBaseView;

/**
 * Created by yuequan on 2017/10/25.
 */

public interface IReleaseCommentView extends IBaseView {

    void onSuccess(HttpResult result);
}