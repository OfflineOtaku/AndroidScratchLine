package li.readme.android.scratch.launchmode;

import android.os.Bundle;
import android.support.annotation.Nullable;

import li.readme.android.scratch.lifecycle.BaseActivity;

/**
 * Created by August on 9/7/16.
 */

public class StandardModeWithAllowReparentActivity extends BaseActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TaskUtils.printCurrentTaskPreview(this);
  }
}
