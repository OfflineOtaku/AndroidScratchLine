package li.readme.android.scratch.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import li.readme.android.scratch.R;
import li.readme.android.scratch.lifecycle.BaseActivity;

public class LaunchModeActivity extends BaseActivity {

  /**
   * <pre>
   *   dumpsys activity a | sed -n '/Running activities/,/^[[:space:]]*$/p'
   * </pre>
   */
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_launch_mode);
    findViewById(R.id.standard).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(LaunchModeActivity.this, StandardModeActivity.class));
      }
    });
  }
}
