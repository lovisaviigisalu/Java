package week5.Exercise87;

public class Apartment {
        private int rooms;
        private int squareMeters;
        private int pricePerSquareMeter;

        public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
            this.rooms = rooms;
            this.squareMeters = squareMeters;
            this.pricePerSquareMeter = pricePerSquareMeter;
        }
        public boolean larger(Apartment otherApartment) {
            if (this.squareMeters > otherApartment.squareMeters) {
                return true;
            } else {
                return false;
            }
        }
        public int priceDifference(Apartment otherApartment ){
            int thisPrice = this.pricePerSquareMeter * this.squareMeters;
            int otherPrice = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
            return Math.abs(thisPrice - otherPrice);
        }
        public boolean moreExpensiveThan(Apartment otherApartment) {
            int thisPrice = this.pricePerSquareMeter * this.squareMeters;
            int otherPrice = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
            if (thisPrice>otherPrice){
                return true;
            }else{
                return false;
            }
        }
}
