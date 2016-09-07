package li.readme.android.scratch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import li.readme.android.scratch.lifecycle.MainActivity;


/**
 * Created by August on 8/29/16.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {
  @Test
  public void testMainActivity() {
    MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
    mainActivity.findViewById(R.id.finishOnResume).performClick();
  }
}
