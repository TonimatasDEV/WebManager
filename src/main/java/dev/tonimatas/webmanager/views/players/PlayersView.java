package dev.tonimatas.webmanager.views.players;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import dev.tonimatas.webmanager.views.MainLayout;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Players")
@Route(value = "players", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class PlayersView extends Composite<VerticalLayout> {

    public PlayersView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
