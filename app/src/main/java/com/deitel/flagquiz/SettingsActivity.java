// SettingsActivity.java
// Activity to display SettingsFragment on a phone
package com.deitel.flagquiz;

import android.app.Activity;
import android.os.Bundle;

public class SettingsActivity extends Activity
{
   // use FragmentManager to display SettingsFragment
   @Override
   protected void onCreate(Bundle savedInstanceState) 
   {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_settings);
   }
} // end class SettingsActivity



/*************************************************************************
 * (C) Copyright 2016 Habibu Abdullahi                                    *
 * DISCLAIMER: The authors and publisher of this app have used their      *
 * best efforts in developing this app. These efforts include the         *
 * development, research, and testing of the application . The authors    *
 * shall not be liable in any event for incidental or                     *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of this application.                   *
 *************************************************************************/