package com.foodApp.DAOimpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.Food_App.DAO.MenuDAO;
import com.foodApp.Model.Menu;
import com.foodApp.util.DBConnection;

public class MenuDAOImple implements MenuDAO {

    private final String INSERT = "INSERT INTO menu (restaurantId, itemName, description, price, isAvailable, imagePath, rating) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String GET_BY_MENUID = "SELECT * FROM menu WHERE menuId = ?";
    private final String GET_ALL_MENUS = "SELECT * FROM menu";
    private final String GET_ALL_BY_Id_RESTAURANT = "SELECT * FROM menu WHERE restaurantId = ?";
    private final String UPDATE = "UPDATE menu SET itemName = ?, description = ?, price = ?, isAvailable = ?, imagePath = ?, rating = ? WHERE menuId = ?";
    private final String DELETE = "DELETE FROM menu WHERE menuId = ?";

    @Override
    public void addMenu(Menu menu) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstm = con.prepareStatement(INSERT)) {

            pstm.setInt(1, menu.getRestaurantId());
            pstm.setString(2, menu.getItemName());
            pstm.setString(3, menu.getDescription());
            pstm.setInt(4, menu.getPrice());
            pstm.setString(5, menu.getIsAvailable());
            pstm.setString(6, menu.getImagePath());
            pstm.setInt(7, menu.getRating());

            int i = pstm.executeUpdate();
            System.out.println("Inserted rows: " + i);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Menu getMenuById(int menuId) {
        Menu menu = null;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstm = con.prepareStatement(GET_BY_MENUID)) {

            pstm.setInt(1, menuId);
            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                menu = new Menu(
                    rs.getInt("menuId"),
                    rs.getInt("restaurantId"),
                    rs.getString("itemName"),
                    rs.getString("description"),
                    rs.getInt("price"),
                    rs.getString("isAvailable"),
                    rs.getString("imagePath"),
                    rs.getInt("rating")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return menu;
    }

    @Override
    public List<Menu> getAllMenu() {
        List<Menu> menuList = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstm = con.prepareStatement(GET_ALL_MENUS);
             ResultSet rs = pstm.executeQuery()) {

            while (rs.next()) {
                Menu menu = new Menu(
                    rs.getInt("menuId"),
                    rs.getInt("restaurantId"),
                    rs.getString("itemName"),
                    rs.getString("description"),
                    rs.getInt("price"),
                    rs.getString("isAvailable"),
                    rs.getString("imagePath"),
                    rs.getInt("rating")
                );
                menuList.add(menu);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return menuList;
    }

    @Override
    public List<Menu> getAllMenusByRestaurant(int restaurantId) {
        List<Menu> menuList = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstm = con.prepareStatement(GET_ALL_BY_Id_RESTAURANT)) {

            pstm.setInt(1, restaurantId);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Menu menu = new Menu(
                    rs.getInt("menuId"),
                    rs.getInt("restaurantId"),
                    rs.getString("itemName"),
                    rs.getString("description"),
                    rs.getInt("price"),
                    rs.getString("isAvailable"),
                    rs.getString("imagePath"),
                    rs.getInt("rating")
                );
                menuList.add(menu);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return menuList;
    }

    @Override
    public void updateMenu(Menu menu) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstm = con.prepareStatement(UPDATE)) {

            pstm.setString(1, menu.getItemName());
            pstm.setString(2, menu.getDescription());
            pstm.setInt(3, menu.getPrice());
            pstm.setString(4, menu.getIsAvailable());
            pstm.setString(5, menu.getImagePath());
            pstm.setInt(6, menu.getRating());
            pstm.setInt(7, menu.getMenuId());

            int i = pstm.executeUpdate();
            System.out.println("Updated rows: " + i);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteMenu(int menuId) {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstm = con.prepareStatement(DELETE)) {

            pstm.setInt(1, menuId);
            int i = pstm.executeUpdate();
            System.out.println("Deleted rows: " + i);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}