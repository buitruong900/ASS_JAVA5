package com.example.demo.controller;

import com.example.demo.entity.Cart;
import com.example.demo.entity.Item;
import com.example.demo.repo.ChiTietSanPhamRepo;
import com.example.demo.servivce.ChiTietSanPhamService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.entity.ChiTietSanPham;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Controller
public class CartController {
    @Autowired
    private HttpSession httpSession;
    @Autowired
    private ChiTietSanPhamRepo chiTietSanPhamRepo;
    @Autowired
    private ChiTietSanPhamService chiTietSanPhamService;

    @GetMapping("/cart/add")
    public String addToCart(@RequestParam("ctspId") UUID ctspId) {
        // lấy chi tiết sp từ repo
        Optional<ChiTietSanPham> chiTietSanPham = chiTietSanPhamRepo.findById(ctspId);
        // tạo ra giỏ hàng chi tiết
        Item item = new Item(chiTietSanPham.get().getId(),
                chiTietSanPham.get().getSanPham().getTen(),
                chiTietSanPham.get().getMauSac().getTen(),
                1,
                chiTietSanPham.get().getGia_ban());
        // lấy giỏ hàng từ session
        Cart cartSesion = (Cart) httpSession.getAttribute("cart");
        // nếu chưa có giỏ hàng
        if (cartSesion == null) {
            Cart cart = new Cart();
            ArrayList<Item> list = new ArrayList<>();
            list.add(item);
            cart.setItems(list);
            httpSession.setAttribute("cart", cart);
        } else {
            // nếu có giỏ hàng
            Cart cart = (Cart) httpSession.getAttribute("cart");
            ArrayList<Item> listItem = cart.getItems();
            // kiểm tra sản phẩm đã có trong giỏ hàng chưa
            // nếu có thì tăng số lượng lên 1
            for (Item itemTmp : listItem) {
                if (itemTmp.getIdCtsp().equals(ctspId)) {
                    itemTmp.setSoLuong(itemTmp.getSoLuong() + 1);
                    return "redirect:/chi-tiet-san-pham/hien-thi";
                }
            }
            // không có thì thêm sản phẩm vào
            listItem.add(item);
        }
        return "redirect:/chi-tiet-san-pham/hien-thi";
    }

    @GetMapping("/gio-hang/view")
    public String addToCart(Model model) {
        Cart cart = (Cart) httpSession.getAttribute("cart");
        System.out.println(cart.toString());
        ArrayList<Item> list = cart.getItems();
        model.addAttribute("gioHangChiTiet", list);
        return "gio-hang-ct";
    }

    @GetMapping("/gio-hang/clear")
    public String clearCart() {
        this.chiTietSanPhamService.clear();
        return "gio-hang-ct";
    }
}
