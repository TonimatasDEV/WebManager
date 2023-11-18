package dev.tonimatas.webmanager.views.properties;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import dev.tonimatas.webmanager.views.MainLayout;
import jakarta.annotation.security.RolesAllowed;
import java.util.ArrayList;
import java.util.List;

@PageTitle("Properties")
@Route(value = "properties", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
public class PropertiesView extends Composite<VerticalLayout> {

    public PropertiesView() {
        FormLayout formLayout3Col = new FormLayout();
        Checkbox checkbox = new Checkbox();
        Checkbox checkbox2 = new Checkbox();
        Checkbox checkbox3 = new Checkbox();
        Checkbox checkbox4 = new Checkbox();
        Checkbox checkbox5 = new Checkbox();
        Checkbox checkbox6 = new Checkbox();
        Checkbox checkbox7 = new Checkbox();
        Checkbox checkbox8 = new Checkbox();
        Checkbox checkbox9 = new Checkbox();
        Checkbox checkbox10 = new Checkbox();
        Checkbox checkbox11 = new Checkbox();
        Checkbox checkbox12 = new Checkbox();
        Checkbox checkbox13 = new Checkbox();
        FormLayout formLayout3Col2 = new FormLayout();
        NumberField numberField = new NumberField();
        NumberField numberField2 = new NumberField();
        NumberField numberField3 = new NumberField();
        NumberField numberField4 = new NumberField();
        Select select = new Select();
        Select select2 = new Select();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        checkbox.setLabel("Spawn monsters");
        checkbox.setWidth("min-content");
        checkbox2.setLabel("Spawn animals");
        checkbox2.setWidth("min-content");
        checkbox3.setLabel("Spawn npcs");
        checkbox3.setWidth("min-content");
        checkbox4.setLabel("White-list");
        checkbox4.setWidth("min-content");
        checkbox5.setLabel("Hardcore");
        checkbox5.setWidth("min-content");
        checkbox6.setLabel("Hide online players");
        checkbox6.setWidth("min-content");
        checkbox7.setLabel("Premium");
        checkbox7.setWidth("min-content");
        checkbox8.setLabel("Allow flight");
        checkbox8.setWidth("min-content");
        checkbox9.setLabel("Allow nether");
        checkbox9.setWidth("min-content");
        checkbox10.setLabel("Require resourcepack");
        checkbox10.setWidth("min-content");
        checkbox11.setLabel("Generate structures");
        checkbox11.setWidth("min-content");
        checkbox12.setLabel("PVP");
        checkbox12.setWidth("min-content");
        checkbox13.setLabel("Enable command block");
        checkbox13.setWidth("min-content");
        formLayout3Col2.setWidth("100%");
        formLayout3Col2.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        numberField.setLabel("Spawn Protection");
        numberField.setWidth("min-content");
        numberField2.setLabel("Simulation distance");
        numberField2.setWidth("min-content");
        numberField3.setLabel("View distance");
        numberField3.setWidth("min-content");
        numberField4.setLabel("Max players");
        numberField4.setWidth("min-content");
        select.setLabel("Difficulty");
        select.setWidth("min-content");
        setSelectSampleData(select);
        select2.setLabel("Gamemode");
        select2.setWidth("min-content");
        setSelectSampleData(select2);
        textField.setLabel("Motd");
        textField.setWidth("100%");
        textField2.setLabel("Resourepack");
        textField2.setWidth("100%");
        getContent().add(formLayout3Col);
        formLayout3Col.add(checkbox);
        formLayout3Col.add(checkbox2);
        formLayout3Col.add(checkbox3);
        formLayout3Col.add(checkbox4);
        formLayout3Col.add(checkbox5);
        formLayout3Col.add(checkbox6);
        formLayout3Col.add(checkbox7);
        formLayout3Col.add(checkbox8);
        formLayout3Col.add(checkbox9);
        formLayout3Col.add(checkbox10);
        formLayout3Col.add(checkbox11);
        formLayout3Col.add(checkbox12);
        formLayout3Col.add(checkbox13);
        getContent().add(formLayout3Col2);
        formLayout3Col2.add(numberField);
        formLayout3Col2.add(numberField2);
        formLayout3Col2.add(numberField3);
        formLayout3Col2.add(numberField4);
        formLayout3Col2.add(select);
        formLayout3Col2.add(select2);
        getContent().add(textField);
        getContent().add(textField2);
    }

    record SampleItem(String value, String label, Boolean disabled) {
    }

    private void setSelectSampleData(Select select) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        select.setItems(sampleItems);
        select.setItemLabelGenerator(item -> ((SampleItem) item).label());
        select.setItemEnabledProvider(item -> !Boolean.TRUE.equals(((SampleItem) item).disabled()));
    }
}
