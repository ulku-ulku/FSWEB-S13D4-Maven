package org.example;

public class Point {
    // x ve y değişkenleri sadece sınıf içerisinden erişilebilir (private)
    private int x;
    private int y;

    // Constructor: x ve y değerlerini ayarlayan yapılandırıcı
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter ve Setter metodları
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // distance() -> (0,0) noktasına uzaklığı hesaplar
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // distance(int a, int b) -> (a,b) noktasına uzaklığı hesaplar
    public double distance(int a, int b) {
        return Math.sqrt((a - x) * (a - x) + (b - y) * (b - y));
    }

    // distance(Point p) -> başka bir Point nesnesine uzaklığı hesaplar
    public double distance(Point p) {
        return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
    }
}
