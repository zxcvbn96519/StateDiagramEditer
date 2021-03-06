package model;

import factory.*;
import javafx.scene.effect.Glow;
import javafx.scene.shape.Circle;
import sample.GuiController;
import builder.ModelBuilder;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Shape;
import javafx.scene.text.Text;

import java.io.Serializable;

public abstract class Model{
    double orgSceneX, orgSceneY;
    double orgTranslateX, orgTranslateY;
    public abstract Model clone();
    public abstract Group getGroup();
    public abstract Group getGroup2();
    public abstract MText getText();
    public abstract MCircle getCircle();
    public abstract MLine getLine();
    public abstract Anchor getStart();
    public abstract Anchor getEnd();
    public abstract Arrow getArrow();
    public void setOrgSceneX(double orgSceneX) {
        this.orgSceneX = orgSceneX;
    }
    public void setOrgSceneY(double orgSceneY) {
        this.orgSceneY = orgSceneY;
    }
    public void setOrgTranslateX(double orgTranslateX) {
        this.orgTranslateX = orgTranslateX;
    }
    public void setOrgTranslateY(double orgTranslateY) {
        this.orgTranslateY = orgTranslateY;
    }
    public double getOrgTranslateY() {
        return orgTranslateY;
    }
    public double getOrgTranslateX() {
        return orgTranslateX;
    }
    public double getOrgSceneY() {
        return orgSceneY;
    }
    public double getOrgSceneX() {
        return orgSceneX;
    }

}
