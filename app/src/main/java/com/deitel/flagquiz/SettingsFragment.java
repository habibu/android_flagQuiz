// SettingsFragment.java
// Subclass of PreferenceFragment for managing app settings
package com.deitel.flagquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsFragment extends PreferenceFragment
{   
   // creates preferences GUI from preferences.xml file in res/xml
   @Override
   public void onCreate(Bundle savedInstanceState) 
   {
      super.onCreate(savedInstanceState);
      addPreferencesFromResource(R.xml.preferences); // load from XML
   } 
} // end class SettingsFragment



/*************************************************************************
 * (C) Copyright 2016 Habibu Abdullahi                                    *
 * DISCLAIMER: The authors and publisher of this app have used their      *
 * best efforts in developing this app. These efforts include the         *
 * development, research, and testing of the application . The authors    *
 * shall not be liable in any event for incidental or                     *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of this application.                   *
 *************************************************************************/