package com.example;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.HighlightCondition;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("index")
// tag::snippet[]
public class AppLayoutBasic extends AppLayout {

    public AppLayoutBasic() {
        createHeader();
        createDrawer();
    }

    public void createHeader(){
        H1 logo =new H1("Capstone");
        logo.addClassNames("text-l","m-m");

        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(),logo);

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.expand(logo);
        header.setWidthFull();
        header.addClassNames("py-0","py-m");

        addToNavbar(header);
    }

    public void createDrawer(){
        RouterLink capstoneView = new RouterLink("Projects",CapstoneView.class);
       // capstoneView.setHighlightCondition(HighlightCondition.sameLocation());

        addToDrawer(new VerticalLayout(
            capstoneView
        ));
    }


}

