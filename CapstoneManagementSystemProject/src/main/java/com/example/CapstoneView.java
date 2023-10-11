package com.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;
@Route("/home")
public class CapstoneView extends VerticalLayout {
    public CapstoneView(CapstoneService service){
        GridCrud<Capstone> crud = new GridCrud<>(Capstone.class, service);
        add(crud);
        Grid<Capstone> grid = crud.getGrid();
        grid.setColumnOrder(
                // Columns keys are the exact property names of the bean class
                grid.getColumnByKey("p_id"),
                grid.getColumnByKey("domain"),
                grid.getColumnByKey("problem_st"),
                grid.getColumnByKey("team_id"),
                grid.getColumnByKey("team_no")

        );
        setSizeFull();
    }
}
