package com.artshell;

import dagger.Module;
import dagger.Provides;

@Module
public class PumpModule {
    @Provides
    static Pump providePump(Thermosiphon pump){
        return pump;
    }
}
