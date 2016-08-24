package li.readme.android.aspectj;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by August on 8/24/16.
 */
@Aspect
public class ActivityLogger {
  private static final String TAG = "ActivityLogger";

  @After("execution(* android.app.Activity.on**(..))")
  public void onCallLifecycleMethod(JoinPoint joinPoint) throws Throwable {
    Log.i(TAG, "onCallLifecycleMethod: " + joinPoint.getSignature());
  }

}
