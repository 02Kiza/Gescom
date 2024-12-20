
package metier;

    public class Tva {
        private int idTva;
        private double tauxTva;

        // Getters et setters
        public int getIdTva() {
            return idTva;
        }

        public void setIdTva(int idTva) {
            this.idTva = idTva;
        }

        public double getTauxTva() {
            return tauxTva;
        }

        public void setTauxTva(double tauxTva) {
            this.tauxTva = tauxTva;
        }

        public Tva(int idTva, double tauxTva) {
            this.idTva = idTva;
            this.tauxTva = tauxTva;
        }
    }
