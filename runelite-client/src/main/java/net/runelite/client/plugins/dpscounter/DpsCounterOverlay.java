package net.runelite.client.plugins.dpscounter;

import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;
import net.runelite.client.ui.overlay.components.PanelComponent;

import javax.inject.Inject;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class DpsCounterOverlay extends Overlay
{
    private final PanelComponent panelComponent = new PanelComponent();
    private final DpsCounterPlugin plugin;

    @Inject
    private DpsCounterOverlay(DpsCounterPlugin plugin)
    {
        setPosition(OverlayPosition.BOTTOM_RIGHT);
        setPriority(OverlayPriority.LOW);
        this.plugin = plugin;
    }


    public Dimension render(Graphics2D graphics)
    {

        panelComponent.getChildren().clear();
        panelComponent.getChildren().add(LineComponent.builder()
                .left("Mjay's gay af dps counter")
                .build());
        panelComponent.getChildren().add(LineComponent.builder()
                .left("Damage: ")
                .right("0.2")
                .build());


        return panelComponent.render(graphics);
    }
}