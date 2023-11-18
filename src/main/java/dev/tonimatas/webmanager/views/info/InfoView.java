package dev.tonimatas.webmanager.views.info;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.tonimatas.webmanager.views.MainLayout;

@PageTitle("Info")
@Route(value = "", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class InfoView extends Composite<VerticalLayout> {

    public InfoView() {
        H1 h1 = new H1();
        H3 h3 = new H3();
        Paragraph textLarge = new Paragraph();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        h1.setText("WebManager");
        h1.setWidth("max-content");
        h3.setText("Description");
        h3.setWidth("max-content");
        textLarge.setText("Coming Soon");
        textLarge.setWidth("100%");
        textLarge.getStyle().set("font-size", "var(--lumo-font-size-xl)");
        getContent().add(h1);
        getContent().add(h3);
        getContent().add(textLarge);
    }
}
