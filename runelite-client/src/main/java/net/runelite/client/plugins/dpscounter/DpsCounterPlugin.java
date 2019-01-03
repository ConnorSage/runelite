package net.runelite.client.plugins.dpscounter;

import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
        name = "DPS Counter",
        description = "Displays your current damage output per second",
        tags = {"dps", "counter", "damage"}
)
@Slf4j
public class DpsCounterPlugin extends Plugin
{
    @Inject
    private DpsCounterOverlay dpscounteroverlay;

    @Inject
    private OverlayManager overlayManager;

    @Override
    protected void startUp() throws Exception
    {
        overlayManager.add(dpscounteroverlay);
    }

    @Override
    protected void shutDown() throws Exception
    {
        overlayManager.remove(dpscounteroverlay);
    }
}
