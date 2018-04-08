package Modules;

import java.util.List;

/**
 * Created by Joseph
 */
public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}
