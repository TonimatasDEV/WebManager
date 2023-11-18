package dev.tonimatas.webmanager.views.console;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.messages.MessageInput;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import dev.tonimatas.webmanager.views.MainLayout;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Console")
@Route(value = "console", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class ConsoleView extends Composite<VerticalLayout> {

    public ConsoleView() {
        TextArea textArea = new TextArea();
        MessageInput messageInput = new MessageInput();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        textArea.setLabel("Logs");
        textArea.setWidth("100%");
        textArea.getStyle().set("flex-grow", "1");
        messageInput.setWidth("100%");
        getContent().add(textArea);
        getContent().add(messageInput);
    }
}
