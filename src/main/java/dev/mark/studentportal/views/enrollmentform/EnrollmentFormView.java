package dev.mark.studentportal.views.enrollmentform;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import java.util.ArrayList;
import java.util.List;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Enrollment Form")
@Route("enrollment-form")
@Menu(order = 1, icon = LineAwesomeIconUrl.USER)
public class EnrollmentFormView extends Composite<VerticalLayout> {

    public EnrollmentFormView() {
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        FormLayout formLayout2Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        DatePicker datePicker = new DatePicker();
        TextField textField3 = new TextField();
        EmailField emailField = new EmailField();
        H3 h32 = new H3();
        FormLayout formLayout2Col2 = new FormLayout();
        Select select = new Select();
        Select select2 = new Select();
        Select select3 = new Select();
        Select select4 = new Select();
        TextField textField4 = new TextField();
        H3 h33 = new H3();
        FormLayout formLayout2Col3 = new FormLayout();
        Select select5 = new Select();
        ComboBox comboBox = new ComboBox();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        HorizontalLayout layoutRow = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        getContent().setJustifyContentMode(JustifyContentMode.START);
        getContent().setAlignItems(Alignment.CENTER);
        layoutColumn2.setWidth("100%");
        layoutColumn2.setMaxWidth("800px");
        layoutColumn2.setHeight("min-content");
        h3.setText("Personal Information");
        h3.setWidth("100%");
        formLayout2Col.setWidth("100%");
        textField.setLabel("First Name");
        textField2.setLabel("Last Name");
        datePicker.setLabel("Birthday");
        textField3.setLabel("Phone Number");
        emailField.setLabel("Email");
        h32.setText("Address");
        h32.setWidth("max-content");
        formLayout2Col2.setWidth("100%");
        select.setLabel("Province");
        select.setWidth("min-content");
        setSelectSampleData(select);
        select2.setLabel("Region");
        select2.setWidth("min-content");
        setSelectSampleData(select2);
        select3.setLabel("Zip Code/Postal Code");
        select3.setWidth("min-content");
        setSelectSampleData(select3);
        select4.setLabel("Barangay");
        select4.setWidth("min-content");
        setSelectSampleData(select4);
        textField4.setLabel("Home Address");
        textField4.setWidth("100%");
        h33.setText("Program");
        h33.setWidth("max-content");
        formLayout2Col3.setWidth("100%");
        select5.setLabel("Level");
        select5.setWidth("min-content");
        setSelectSampleData(select5);
        comboBox.setLabel("Semester");
        comboBox.setWidth("min-content");
        setComboBoxSampleData(comboBox);
        layoutColumn3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Save");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancel");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(formLayout2Col);
        formLayout2Col.add(textField);
        formLayout2Col.add(textField2);
        formLayout2Col.add(datePicker);
        formLayout2Col.add(textField3);
        formLayout2Col.add(emailField);
        layoutColumn2.add(h32);
        layoutColumn2.add(formLayout2Col2);
        formLayout2Col2.add(select);
        formLayout2Col2.add(select2);
        formLayout2Col2.add(select3);
        formLayout2Col2.add(select4);
        layoutColumn2.add(textField4);
        layoutColumn2.add(h33);
        layoutColumn2.add(formLayout2Col3);
        formLayout2Col3.add(select5);
        formLayout2Col3.add(comboBox);
        layoutColumn2.add(layoutColumn3);
        layoutColumn2.add(layoutRow);
        layoutRow.add(buttonPrimary);
        layoutRow.add(buttonSecondary);
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

    private void setComboBoxSampleData(ComboBox comboBox) {
        List<SampleItem> sampleItems = new ArrayList<>();
        sampleItems.add(new SampleItem("first", "First", null));
        sampleItems.add(new SampleItem("second", "Second", null));
        sampleItems.add(new SampleItem("third", "Third", Boolean.TRUE));
        sampleItems.add(new SampleItem("fourth", "Fourth", null));
        comboBox.setItems(sampleItems);
        comboBox.setItemLabelGenerator(item -> ((SampleItem) item).label());
    }
}
