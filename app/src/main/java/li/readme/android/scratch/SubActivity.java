package li.readme.android.scratch;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by August on 8/25/16.
 */

public class SubActivity extends BaseActivity {
  public static final String KEY_FINISH = "KEY_FINISH";

  public static final int FINISH_ONCREATE = 1;
  public static final int FINISH_ONSTART = 2;
  public static final int FINISH_ONRESUME = 3;
  private int mFinishKey;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mFinishKey = getIntent().getIntExtra(KEY_FINISH, 0);
    finishIfMatched(FINISH_ONCREATE);
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    finish();
  }

  @Override
  protected void onStart() {
    super.onStart();
    finishIfMatched(FINISH_ONSTART);
  }

  @Override
  protected void onResume() {
    super.onResume();
    finishIfMatched(FINISH_ONRESUME);
  }

  private void finishIfMatched(int finishKey) {
    if (finishKey == mFinishKey) {
      finish();
    }
  }
}
