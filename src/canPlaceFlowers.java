import java.util.List;

class canPlaceFlowers {
    public boolean canPlaceFlowers(List<Integer> flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        
        for (int i = 0; i < flowerbed.size(); i++) {
            boolean left = (i == 0) || (flowerbed.get(i - 1) == 0);
            boolean right = (i == flowerbed.size() - 1) || (flowerbed.get(i + 1) == 0);
            if (left && right && flowerbed.get(i) == 0) {
                flowerbed.set(i, 1);
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
