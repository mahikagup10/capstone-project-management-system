package com.example.mew.example;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;
@Route("/home1")
public class CapstoneView1 extends VerticalLayout {
    public CapstoneView1(CapstoneService1 service){
        GridCrud<Capstone1> crud = new GridCrud<>(Capstone1.class, service);
        add(crud);
        Grid<Capstone1> grid = crud.getGrid();
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
