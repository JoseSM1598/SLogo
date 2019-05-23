module FrontEnd {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires BackEnd;
    requires java.desktop;

    exports frontend.ExternalAPI;
    exports frontend.Util;
    exports frontend.GUI;
    exports main;
    exports frontend.GUI.SubViews;
}
