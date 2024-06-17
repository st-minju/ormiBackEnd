package JavaStudy0617;

public class ProfileService {
  ProfileRepository profileRepository;

  /*public void saveProfile() {
  	profileRepository = new ProfileDBRepository();
  	profileRepository.save();

  }*/

  public void saveProfile(ProfileRepository profileRepository) {
    profileRepository.save();
  }
}
