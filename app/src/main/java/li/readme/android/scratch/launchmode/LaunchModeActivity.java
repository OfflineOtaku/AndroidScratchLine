package li.readme.android.scratch.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import li.readme.android.scratch.R;
import li.readme.android.scratch.lifecycle.BaseActivity;

public class LaunchModeActivity extends BaseActivity {

  // dumpsys activity a | sed -n '/Main stack:/,/^[[:space:]]*$/p' | sed -n '/^[[:space:]]*\*/p'
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
    findViewById(R.id.other_task).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(LaunchModeActivity.this, OtherTaskActivity.class).addFlags
            (Intent.FLAG_ACTIVITY_NEW_TASK));
      }
    });
  }
}
