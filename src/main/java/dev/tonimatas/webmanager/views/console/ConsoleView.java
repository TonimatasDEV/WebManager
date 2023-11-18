package dev.tonimatas.webmanager.views.console;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import dev.tonimatas.webmanager.views.MainLayout;

@PageTitle("Console")
@Route(value = "console", layout = MainLayout.class)
@AnonymousAllowed
@Uses(Icon.class)
public class ConsoleView extends Composite<VerticalLayout> {

    public ConsoleView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        TextArea textArea = new TextArea();
        HorizontalLayout layoutRow = new HorizontalLayout();
        MessageInput messageInput = new MessageInput();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        textArea.setLabel("Logs");
        textArea.setWidth("100%");
        textArea.getStyle().set("flex-grow", "1");
        textArea.setMaxHeight("567px");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        messageInput.getStyle().set("flex-grow", "1");
        messageInput.setHeight("100%");
        getContent().add(layoutColumn2);
        layoutColumn2.add(textArea);
        getContent().add(layoutRow);
        layoutRow.add(messageInput);
    }
}
